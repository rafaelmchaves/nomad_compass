# Nomad Compass
Microservice that shows the prices and better routes to digital nomads.

Api's : 

/cities: Endpoint that will be consumed by the frontend or other sources to get all the cities that we have estimation.

/estimation: We will calculate the estimation of all routes the digital nomad will live.


Tasks to do:

```
1 - Add cache in the cities api.
2 - Create the Life Cost repository to find the city life cost.
3 - esmitation controller call the life cost repository by usecase.
4 - Implement use case that calculates the estimate expenses.
5 - Add cache to the estimation api
6 - Develop the repository of flights and show the cost of it in the api
```


