##This project demonstrates an OAuth2 client implementation
##It uses GitHub as a OAuth provider and essentially end point /demo is secured with OAuth
##We have not defined any bean for client registration because we have created properties in
##application properties. Using those properties spring boot automatically creates properties for us

##In below properties "github" is refered to as registrationId in Spring OAuth2 client implementation 
##This can be anything we want it to be, but it needs to be consistent across how we are creating clientRegistration bean
##Spring already gives us a list of common OAuth providers in enum CommonOAuth2Provider
spring.security.oauth2.client.registration.github.client-id
spring.security.oauth2.client.registration.github.client-secret

##If we were to use google as registration provider in our application we could changed properties like:
spring.security.oauth2.client.registration.google.client-id
spring.security.oauth2.client.registration.google.client-secret
