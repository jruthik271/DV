# Load dataset (already available in R)
data("AirPassengers")

# View dataset
print(AirPassengers)

# Line plot
plot(AirPassengers,
     type = "l",
     main = "Air Passengers Over Time",
     xlab = "Year",
     ylab = "Number of Passengers",
     col = "blue",
     lwd = 2)

library(ggplot2)

df <- data.frame(
  time = as.numeric(time(AirPassengers)), 
  passengers = as.numeric(AirPassengers)
)

ggplot(df, aes(x = time, y = passengers))+
  geom_line(color = "blue") +
  ggtitle("Air Passengers Over Time") +
  xlab("Year") +
  ylab("Passengers")