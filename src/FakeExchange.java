class FakeExchange implements Exchange {

  @Override
  public float rate(String origin, String target) {
    if (origin.equals("USD") && target.equals("Euro")) {
      return .85f; // 1 USD to Euro
    } else if (origin.equals("USD") && target.equals("CAD")) {
      return 1.43f; // 1 USD to Canadian Dollar
    }
    return 1.0f;  // Default 1:1 exchange for unknown currencies
  }
}