| Author | Created on | Version | Last updated by | Last edited on |
| ------ | ---------- | ------- | --------------- | -------------- |
| Bhavin    | 21-03-24   | version 1 | Bhavin         | 21-03-24       |

# Installation of Redis
### Today we will see how to install Redis, but before installing Redis let me introduce Redis to you.

# Introduce
Redis is an open-source, in-memory data structure store that can be used as a database, cache, and message broker. It supports various data structures such as strings, hashes, lists, sets, and sorted sets, and provides high-performance, distributed, and scalable data storage and retrieval capabilities. Redis is commonly used in web applications for caching, real-time analytics, job queue management, and other use cases where fast data access is critical.

Now times, Redis is a best option for modern database, that you can use for your next application. One of the best thing which is gives by redis is low latency - Let's assume you have one application where alot user comes or if you have an application where you don't want downtimes to user, there you can use Redis.

## Now let's install Redis on Linux.
### There is two way to install Redis.
1. To install using apt command
2. To install using snap command

1. using apt

       curl -fsSL https://packages.redis.io/gpg | sudo gpg --dearmor -o /usr/share/keyrings/redis-archive-keyring.gpg
       echo "deb [signed-by=/usr/share/keyrings/redis-archive-keyring.gpg] https://packages.redis.io/deb $(lsb_release -cs) main" | sudo tee /etc/apt/sources.list.d/redis.list
       sudo apt-get update
       sudo apt-get install redis

### After using this command you will install Redis on you system, But if you are lazy and don't want to write this all commands then you can use another way...

2. Using snap

       sudo snap install redis


   
