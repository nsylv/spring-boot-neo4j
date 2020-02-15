package com.nsylv.neo4j.experiment.models;

public enum CatBreed {
  AMERICAN_SHORTHAIR ("American Shorthair"),
  BENGAL ("Bengal"),
  MAINE_COON ("Maine Coon"),
  PERSIAN ("Persian"),
  RUSSIAN_BLUE ("Russian Blue"),
  SCOTTISH_FOLD ("Scottish Fold"),
  SIAMESE ("Siamese");

  private final String displayName;
  CatBreed(String displayName) {
    this.displayName = displayName;
  }
  public String toString() {
    return this.displayName;
  }
}
