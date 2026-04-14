# 7th
# Load dataset
data("HairEyeColor")

# Convert to data frame
df <- as.data.frame(HairEyeColor)

# View first few rows
head(df)

# Create mosaic plot
mosaicplot(Freq ~ Hair + Eye, data = df,
           main = "Mosaic Plot of Hair and Eye Color",
           xlab = "Hair Color",
           ylab = "Eye Color",
           color = TRUE)

# Add border
mosaicplot(Freq ~ Hair + Eye, data = df,
           col = rainbow(length(unique(df$Hair))))