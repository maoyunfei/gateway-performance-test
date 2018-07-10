1. run `backend-service-demo`

```
nohup java -Xms3072m -Xmx3072m -Xmn1536m -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75 -XX:+UseCMSInitiatingOccupancyOnly -jar backend-service-demo-0.0.1-SNAPSHOT.jar &
```

2. run `gateway-demo`

```
nohup java -Xms3072m -Xmx3072m -Xmn1536m -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75 -XX:+UseCMSInitiatingOccupancyOnly -jar gateway-demo-0.0.1-SNAPSHOT.jar &
```

3. benchmark with `wrk`


![](/screenshot/pic1.jpg)

