# Day 12
3. OSI Model and TCP/IP model
4. HTTP
5. HTTP Advanced


## 3. OSI Model and TCP/IP Model
### 3.1 OSI Model
The Open Systems Interconnect (OSI) model is a conceptual framework that describes networking or telecommunications systems as seven layers, each with its own function.

![image](https://user-images.githubusercontent.com/40971097/165205753-3097024f-15e7-47e9-9449-f6b8223f2581.png)


- Physical Layer
  - The lowest layer of the OSI Model is concerned with electrically or optically transmitting raw unstructured data bits across the network from the physical layer of the sending device to the physical layer of the receiving device. 

- Data Link Layer
  - At the data link layer, directly connected nodes are used to perform node-to-node data transfer where data is packaged into frames. The data link layer also corrects errors that may have occurred at the physical layer.

- Network Layer
  - The network layer is responsible for receiving frames from the data link layer, and delivering them to their intended destinations among based on the addresses contained inside the frame. The network layer finds the destination by using logical addresses, such as IP (internet protocol). At this layer, routers are a crucial component used to quite literally route information where it needs to go between networks.

- Transport Layer
  - The transport layer manages the delivery and error checking of data packets. It regulates the size, sequencing, and ultimately the transfer of data between systems and hosts. One of the most common examples of the transport layer is TCP or the Transmission Control Protocol.

- Session Layer
  - The session layer controls the conversations between different computers. A session or connection between machines is set up, managed, and termined at layer 5. Session layer services also include authentication and reconnections.

- Presentation Layer
  - The presentation layer formats or translates data for the application layer based on the syntax or semantics that the application accepts. Because of this, it at times also called the syntax layer. This layer can also handle the encryption and decryption required by the application layer.

- Application Layer
  - At this layer, both the end user and the application layer interact directly with the software application. This layer sees network services provided to end-user applications such as a web browser or Office 365. The application layer identifies communication partners, resource availability, and synchronizes communication.

### 3.2 TCP/IP Model
The OSI Model we just looked at is just a reference/logical model. It was designed to describe the functions of the communication system by dividing the communication procedure into smaller and simpler components. But when we talk about the TCP/IP model, it was designed and developed by Department of Defense (DoD) in 1960s and is based on standard protocols. It stands for Transmission Control Protocol/Internet Protocol. The TCP/IP model is a concise version of the OSI model. It contains four layers:
- Process/Application Layer
  - This layer performs the functions of top three layers of the OSI model: Application, Presentation and Session Layer. It is responsible for node-to-node communication and controls user-interface specifications. Some of the protocols present in this layer are: HTTP, HTTPS, FTP, SSH, NTP......
- Host-to-Host/Transport Layer
  - This layer is analogous to the transport layer of the OSI model. It is responsible for end-to-end communication and error-free delivery of data. It shields the upper-layer applications from the complexities of data.
- Internet Layer
  - This layer parallels the functions of OSI’s Network layer. It defines the protocols which are responsible for logical transmission of data over the entire network. 
- Network Access/Link Layer
  - This layer corresponds to the combination of Data Link Layer and Physical Layer of the OSI model. It looks out for hardware addressing and the protocols present in this layer allows for the physical transmission of data.

## 4. HTTP
HTTP, in full HyperText Transfer Protocol, standard application-level protocol used for exchanging files on the World Wide Web. HTTP runs on top of the TCP/IP protocol and (later) on the QUIC protocol. Web browsers are HTTP clients that send file requests to Web servers, which in turn handle the requests via an HTTP service.

HTTP was invented alongside HTML to create the first interactive, text-based web browser: the original World Wide Web. Today, the protocol remains one of the primary means of using the Internet.

As a request-response protocol, HTTP gives users a way to interact with web resources such as HTML files by transmitting hypertext messages between clients and servers. HTTP clients generally use Transmission Control Protocol (TCP) connections to communicate with servers.

HTTP utilizes specific request methods in order to perform various tasks. All HTTP servers use the GET and HEAD methods, but not all support the rest of these request methods:

- GET requests a specific resource in its entirety
- HEAD requests a specific resource without the body content
- POST adds content, messages, or data to a new page under an existing web resource
- PUT directly modifies an existing web resource or creates a new URI if need be
- DELETE gets rid of a specified resource
- TRACE shows users any changes or additions made to a web resource
- OPTIONS shows users which HTTP methods are available for a specific URL
- CONNECT converts the request connection to a transparent TCP/IP tunnel
- PATCH partially modifies a web resource

## 5. HTTP Advanced
### 5.1 HTTP Request Method

![1651023657(1)](https://user-images.githubusercontent.com/40971097/165421185-9eee4703-d05b-497c-82a3-6eb358132711.png)

`safe`: a http method is safe, if it doesn’t alter the state of the server

`idempotent`: if an identical request is made once or several times, the server will be the same state

`cacheable`: private browser cache; shared proxy cache 

HTTP Status Code: 
- 1xx information (100 - 199)
- 2xx success (200 - 299)
- 3xx redirection (300 - 399)
- 4xx client  (400 - 499)
- 5xx server (500 - 599)

Successful Response:
- 200 OK, get/put/post
- 201 created, success and new resources has been created, post
- 202 accepted, request has been received, the process has not been completed
- 204 no content, put, usually update the resources without changing the current page deployed to the user


Redirection Message:
- 307 temporary redirect
- 308 permanent redirect


Client Error:
- 400 bad request, the server could not understand the request due to invalid syntax
- 401 unauthorized -> unauthenticated, the client is not authenticated
- 403 forbidden -> no permission
- 404 not found, the server can not find the requested resources

Server Error:
- 500 internal server error
- 501 not implemented, method not supported by the server
- 502 bad gateway

