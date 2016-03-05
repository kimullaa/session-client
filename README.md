# session-client
SpringSession Sample Project

# run
0. redisの起動(portは6379)
1. mvn clean package
2. java -jar target/session-client-0.0.1-SNAPSHOT.jar --server.port=8080
3. java -jar target/session-client-0.0.1-SNAPSHOT.jar --server.port=8081

# 確認
1. session登録 http://localhost:8080/change?name=kimura
2. 別APでsession確認 http://localhost:8081/confirm
3. ﾜｰｵ!
