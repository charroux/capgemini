# Essai 1

```
./gradlew build    
```
```
docker build -t utilisateur .         
```
```
docker run -p 4000:8080 -t utilisateur     
```
```
docker images    
```
```
docker tag cde80204e940 efrei/utilisateur:1       
```
```
docker push efrei/utilisateur:1     
```
```
minikube start --cpus=2 --memory=5000 --driver=docker
```
```
kubectl create deployment utilisateur --image=efrei/utilisateur:1
```
```
kubectl get pods
```
```
kubectl expose deployment utilisateur --type=LoadBalancer --port=8080
```
```
minikube service utilisateur --url 
```
```
kubectl scale --replicas=2 deployment/utilisateur
```