data("iris")
head(iris)
#simple scatter
plot(iris$Sepal.Length, iris$Sepal.Width,
     main = "Sepal Length vs Sepal Width",
     xlab = "Sepal Length",
     ylab = "Sepal Width",
     col = "blue",
     pch = 19)


#Multivariate Scatter plot
colors <- as.numeric(iris$Species)

plot(iris$Sepal.Length, iris$Petal.Length,
     col = colors,
     pch = 19,
     main = "Multivariate Scatter Plot",
     xlab = "Sepal Length",
     ylab = "Petal Length")

legend("topleft",
       legend = levels(iris$Species),
       col = 1:3,
       pch = 19)


#ScatterPlot Matrix
pairs(iris[, 1:4],
      main = "Scatter Plot Matrix of Iris Dataset",
      col = as.numeric(iris$Species),
      pch = 19)



library(ggplot2)

ggplot(iris, aes(x = Sepal.Length, y = Petal.Length, color = Species)) +
  geom_point() +
  ggtitle("Iris Multivariate Scatter Plot")