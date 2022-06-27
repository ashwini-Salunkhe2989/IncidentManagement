# IncidentManagement
This manages all incidents created for demo project
Eureka:
http://localhost:8070/
Keycloak autharization:

docker run -p 7080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:18.0.1 start-dev

Create Clientid/secrete
And create users

Endpoints to see how can we get auth tooken

http://localhost:7080/realms/master/.well-known/openid-configuration

keyclocak admin console make-service ac enabled and direct access grants enabled to get token via client cedentials its imp

give userid and password and granttye as password you will get token
http://localhost:7080/realms/master/protocol/openid-connect/token

Token validation uri:http://localhost:7080/realms/master/protocol/openid-connect/certs
