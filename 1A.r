#1st - a
# Load dataset
data("VADeaths")

# View dataset
VADeaths

# Convert to vector
values <- as.vector(VADeaths)

# Basic histogram
hist(values,
     main = "Histogram of VA Death Rates",
     xlab = "Death Rates",
     col = "lightblue",
     border = "black")

# Histogram for each category
par(mfrow = c(2, 2))

hist(VADeaths[,1], main = "Rural Male",
     xlab = "Death Rate", col = "red")

hist(VADeaths[,2], main = "Rural Female",
     xlab = "Death Rate", col = "green")

hist(VADeaths[,3], main = "Urban Male",
     xlab = "Death Rate", col = "blue")

hist(VADeaths[,4], main = "Urban Female",
     xlab = "Death Rate", col = "orange")