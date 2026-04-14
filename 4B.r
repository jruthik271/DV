# 4th - b
# Load dataset
data("airquality")

# View structure
str(airquality)

# Remove missing values
aq <- na.omit(airquality)

# Boxplot for Ozone
boxplot(aq$Ozone,
        main = "Boxplot of Ozone",
        ylab = "Ozone Level",
        col = "lightblue")

# Boxplots for multiple parameters
boxplot(aq[, c("Ozone", "Solar.R", "Wind", "Temp")],
        main = "Air Quality Parameters",
        col = rainbow(4),
        ylab = "Values")

# Boxplot grouped by Month
boxplot(Ozone ~ Month, data = aq,
        main = "Ozone by Month",
        xlab = "Month",
        ylab = "Ozone",
        col = rainbow(length(unique(aq$Month))))