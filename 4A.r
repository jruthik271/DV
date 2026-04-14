# 4th - a
# Load dataset
data("iris")

# View structure
str(iris)

# Basic boxplot
boxplot(iris$Sepal.Length,
        main = "Boxplot of Sepal Length",
        ylab = "Sepal Length",
        col = "lightblue")

# Boxplot grouped by Species
boxplot(Sepal.Length ~ Species, data = iris,
        main = "Sepal Length by Species",
        xlab = "Species",
        ylab = "Sepal Length",
        col = c("red", "green", "blue"))

# Multiple boxplots for all features
boxplot(iris[,1:4],
        main = "Boxplots of Iris Features",
        col = rainbow(4))

# Boxplot with color palette for species
boxplot(Petal.Length ~ Species, data = iris,
        main = "Petal Length by Species",
        col = rainbow(length(unique(iris$Species))))