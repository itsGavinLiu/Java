# 1. Memcached vs Radis

## 1.1 What Is Redis?
Redis is an open source, in-memory data structure store, used as a database, cache, and message broker.
Besides, Redis is a way to store key-value pairs, in a selection of different data types such as Lists, Sets, and Hashes. 
Redis keeps this data in memory, meaning that it is extremely fast to return the data when requested. 
This speed makes it perfect as a cache for your application where you need to request and return data and speed is an important factor.

## 1.2 What Is Memcached?
Memcached is a free and open source, high-performance, distributed memory object caching system. 
Like Redis, Memcached is an open source way to store key value pairs in memory, meaning that data is very quickly retrieved. 
This makes Memcached another way to return data where speed is a factor. Memcached is also multithreaded, 
meaning that there may be some performance improvements where your application can utilize multiple cores.

## 1.3 Comparisons

### Sub-millisecond latency
Both Redis and Memcached support sub-millisecond response times. By storing data in-memory they can read data more quickly than disk based databases.

### Developer ease of use
Both Redis and Memcached are syntactically easy to use and require a minimal amount of code to integrate into your application.

### Data partitioning
Both Redis and Memcached allow you to distribute your data among multiple nodes. This allows you to scale out to better handle more data when demand grows.

### Support for a broad set of programming languages
Both Redis and Memcached have many open-source clients available for developers. Supported languages include Java, Python, PHP, C, C++, C#, JavaScript, Node.js, Ruby, Go and many others.

### Advanced data structures
In addition to strings, Redis supports lists, sets, sorted sets, hashes, bit arrays, and hyperloglogs. Applications can use these more advanced data structures to support a variety of use cases. For example, you can use Redis Sorted Sets to easily implement a game leaderboard that keeps a list of players sorted by their rank.

### Multithreaded architecture
Since Memcached is multithreaded, it can make use of multiple processing cores. This means that you can handle more operations by scaling up compute capacity.

### Snapshots
With Redis you can keep your data on disk with a point in time snapshot which can be used for archiving or recovery.

### Replication
Redis lets you create multiple replicas of a Redis primary. This allows you to scale database reads and to have highly available clusters.

### Transactions
Redis supports transactions which let you execute a group of commands as an isolated and atomic operation.

### Pub/Sub
Redis supports Pub/Sub messaging with pattern matching which you can use for high performance chat rooms, real-time comment streams, social media feeds, and server intercommunication.

### Lua scripting
Redis allows you to execute transactional Lua scripts. Scripts can help you boost performance and simplify your application.

### Geospatial support
Redis has purpose-built commands for working with real-time geospatial data at scale. You can perform operations like finding the distance between two elements (for example people or places) and finding all elements within a given distance of a point.

# 2. Amazon ElastiCache
Amazon ElastiCache offers fully managed Redis and Memcached. With both ElastiCache for Redis and ElastiCache for Memcached you:

- No longer need to perform management tasks such as hardware provisioning, software patching, setup, configuration, and failure recovery. This allows you to focus on high value application development.
- Have access to monitoring metrics associated with your nodes, enabling you to diagnose and react to issues quickly.
- Can take advantage of cost-efficient and resizable hardware capacity.

Additonally, ElastiCache for Redis features an enhanced engine which improves on the reliability and efficiency of open source Redis while remaining Redis-compatible so your existing Redis applications work seamlessly without changes. ElastiCache for Redis also features Online Cluster Resizing, supports encryption, and is HIPAA eligible and PCI DSS compliant.
