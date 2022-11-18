package es.ull.practica03.Strategy;

import org.jfree.data.category.CategoryDataset;

public interface iCreateDataBase {
    CategoryDataset createDataBase(CSVFile file, int xAxis, int yAxis);
}
