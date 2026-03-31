data("mtcars")
head(mtcars)

cor_matrix <- cor(mtcars)
print(cor_matrix)
heatmap(cor_matrix,
        main = "Heatmap of mtcars Correlation Matrix",
        col = heat.colors(256),
        scale = "column")

install.packages("reshape2")

library(ggplot2)
library(reshape2)

# Convert matrix to long format
melted_corr <- melt(cor_matrix)

ggplot(melted_corr, aes(x = Var1, y = Var2, fill = value)) +
  geom_tile() +
  scale_fill_gradient2(low = "blue", high = "red", mid = "white",
                       midpoint = 0, limit = c(-1,1)) +
  theme_minimal() +
  ggtitle("Correlation Heatmap of mtcars") +
  theme(axis.text.x = element_text(angle = 45, hjust = 1))