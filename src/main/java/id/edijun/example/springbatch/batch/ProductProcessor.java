package id.edijun.example.springbatch.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import id.edijun.example.springbatch.model.Product;

public class ProductProcessor implements ItemProcessor<Product, Product> {

	private static final Logger log = LoggerFactory.getLogger(ProductProcessor.class);

	@Override
	public Product process(final Product product) throws Exception {

		final String id = product.getId();
		final String name = product.getName();
		final Integer price = product.getPrice();
		final String description = product.getDescription();

		final Product transformedProduct = new Product(id, name, price, description);

		log.info("Converting (" + product + ") into (" + transformedProduct + ")");

		return transformedProduct;
	}
}
