package com.commercetools.project.sync.model.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Nullable;

public class CombinedResult {
  private final ResultingResourcesContainer products;
  private final ResultingResourcesContainer categories;
  private final ResultingResourcesContainer productTypes;
  private final ResultingResourcesContainer customObjects;

  @JsonCreator
  public CombinedResult(
      @JsonProperty("products") @Nullable final ResultingResourcesContainer products,
      @JsonProperty("categories") @Nullable final ResultingResourcesContainer categories,
      @JsonProperty("productTypes") @Nullable final ResultingResourcesContainer productTypes,
      @JsonProperty("customObjects") @Nullable final ResultingResourcesContainer customObjects) {

    this.products = products;
    this.categories = categories;
    this.productTypes = productTypes;
    this.customObjects = customObjects;
  }

  public ResultingResourcesContainer getProducts() {
    return products;
  }

  public ResultingResourcesContainer getCategories() {
    return categories;
  }

  public ResultingResourcesContainer getProductTypes() {
    return productTypes;
  }

  public ResultingResourcesContainer getCustomObjects() {
    return customObjects;
  }
}
