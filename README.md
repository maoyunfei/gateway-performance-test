### STEP 1

#### run `backend-service-demo`

```
nohup java -Xms3072m -Xmx3072m -Xmn1536m -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75
 -XX:+UseCMSInitiatingOccupancyOnly -jar backend-service-demo-0.0.1-SNAPSHOT.jar &
```

### STEP 2

#### run `gateway-demo`

```
nohup java -Xms3072m -Xmx3072m -Xmn1536m -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75
 -XX:+UseCMSInitiatingOccupancyOnly -jar gateway-demo-0.0.1-SNAPSHOT.jar &
```

### STEP 3

#### benchmark with `wrk`

* test response with 100 and 10000 characters

![](https://github.com/maoyunfei/gateway-performance-test/blob/master/screenshot/pic1.jpg?raw=true)

* test response with 30000 characters

![](https://github.com/maoyunfei/gateway-performance-test/blob/master/screenshot/pic2.jpg?raw=true)

* test response with 50000 characters

![](https://github.com/maoyunfei/gateway-performance-test/blob/master/screenshot/pic3.jpg?raw=true)

* more test with proxy

![](https://github.com/maoyunfei/gateway-performance-test/blob/master/screenshot/pic4.jpg?raw=true)
