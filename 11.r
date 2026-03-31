data("iris")
head(iris)

cor_matrix <- cor(iris[, 1:4])
print(cor_matrix)

# Install if not already installed
install.packages("corrplot")

# Load library
library(corrplot)

# Plot correlogram
corrplot(cor_matrix,
         method = "circle",
         type = "upper",
         tl.col = "black",
         tl.srt = 45)

corrplot(cor_matrix,
         method = "color",
         addCoef.col = "black",
         number.cex = 0.7)