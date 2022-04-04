import java.io.*;
import java.util.Optional;

public class TwoThread {
    static String output = "";
    static boolean isChange = false;
    public static void main(String[] args) throws IOException, InterruptedException {
        Input i = new Input();
        Output o = new Output();
        new Thread(){
            public void run(){
                try {
                    i.inputThread();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }.start();
        new Thread(){
            public void run(){
                try {
                    o.outputThread();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }.start();

    }

    public static synchronized String ModifyInfo(String output, int i){
        if(i == 0){
            TwoThread.output = output;
            isChange = true;
            return "-1";
        }else{
            return  TwoThread.output;
        }
    }
}

class Input {
    public void inputThread() throws IOException, InterruptedException {
        System.out.println("This is input thread");
        BufferedReader br = new BufferedReader(new FileReader("./Assignment4/input.txt"));
        String input = br.readLine();
        int result = 0;
        boolean isAdd = true;
        while(input != null){
            String clean[] = input.split(" ");
            if(clean.length > 1){
                for(String str : clean){
                    if(str.equals("+")){
                        isAdd = true;
                    }else if(str.equals("-")){
                        isAdd = false;
                    }else {
                        if(isAdd){
                            result += Integer.parseInt(str);
                        }else{
                            result -= Integer.parseInt(str);
                        }
                    }
                }
                while(TwoThread.isChange){
                }
                TwoThread.ModifyInfo(input + " = " + result, 0);
                System.out.println("finish reading... Go to sleep...");
                Thread.sleep(1000);
            }else{
                while(TwoThread.isChange){
                }
                TwoThread.ModifyInfo(input,0);
                System.out.println("finish reading... Go to sleep...");
                Thread.sleep(1000);
            }
            result = 0;
            isAdd = true;
            input = br.readLine();
        }
        TwoThread.ModifyInfo(null, 0);
    }
}

class Output {
    public void outputThread() throws IOException, InterruptedException {
        System.out.println("This is output thread");
        BufferedWriter br = new BufferedWriter(new FileWriter("./Assignment4/output.txt"));
        while(TwoThread.ModifyInfo("",1) != null){
            if(TwoThread.isChange){
                br.write(TwoThread.ModifyInfo("",1) + "\n");
                TwoThread.isChange = false;
                System.out.println("finish writing... Go to sleep...");
                Thread.sleep(1000);
            }
        }
        br.close();
    }
}