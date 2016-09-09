class Event {
  private Integer mPeopleCount;
  private Integer mEntertainment;
  private Integer mFood;
  private Integer mAlcohol;

  public Event(Integer peopleCount, Integer entertainment, Integer food, Integer alcohol) {
    mPeopleCount = peopleCount;
    mEntertainment = entertainment;
    mFood = food;
    mAlcohol = alcohol;
  }

  public Integer getPeopleCount() {
    return mPeopleCount;
  }
  public Integer getEntertainment() {
    return mEntertainment;
  }
  public Integer getFood() {
    return mFood;
  }
  public Integer getAlcohol() {
    return mAlcohol;
  }

  public Integer calculatePeopleCost() {
    Integer costVal = 0;
    for (Integer index = 0; index < mPeopleCount; index++ ) {
      costVal += 1;
    }
    Integer cost = costVal * 200;
    return cost;
  }

  public Integer calculateEntertainmentCost() {
    Integer costVal = 0;
    for (Integer index = 0; index < mEntertainment; index++ ) {
      costVal += 1;
    }
    Integer cost = costVal * 100;
    return cost;
  }

  public Integer calculateFoodCost() {
    Integer costVal = 0;
    for (Integer index = 0; index < mFood; index++ ) {
      costVal += 1;
    }
    Integer cost = costVal * 500;
    return cost;
  }

  public Integer calculateAlcoholCost() {
    Integer costVal = 0;
    for (Integer index = 0; index < mAlcohol; index++ ) {
      costVal += 1;
    }
    Integer cost = costVal * 1000;
    return cost;
  }

}
