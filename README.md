
# Teperature Sensor API

Teperature Sensor API canbe be used by a client connected to a temperature sensor. The sensor sends to the client a continuous stream of temperature data. It's possible for the client not to have an internet connection in which case, the data is stored locally and synchronized, in bulk, to the API as soon as the network connection is established. The client displays this information in a chart where data can be seen per hour or daily, however since the client has resource limitations, it relies on the API to aggregate data.


Create the following endpoints in your API:
- an endpoint to save temperature data
- an endpoint to retrieve the aggregated temperature data (hourly, daily). Performance is
critical on this endpoint so it should return the data as fast as possible.