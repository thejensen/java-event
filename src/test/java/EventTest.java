import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void getPeopleCount_returnsValueForPeopleCount_Integer() {
  Event testEvent = new Event(1, 1, 1, 1);
  Integer expected = 1;
  assertEquals(expected, testEvent.getPeopleCount());
  }

  @Test
  public void getEntertainment_returnsValueForEntertainment_Integer() {
  Event testEvent = new Event(1, 1, 1, 1);
  Integer expected = 1;
  assertEquals(expected, testEvent.getEntertainment());
  }

  @Test
  public void getFood_returnsValueForFood_Integer() {
  Event testEvent = new Event(1, 1, 1, 1);
  Integer expected = 1;
  assertEquals(expected, testEvent.getFood());
  }

  @Test
  public void getAlcohol_returnsValueForAlcohol_Integer() {
  Event testEvent = new Event(1, 1, 1, 1);
  Integer expected = 1;
  assertEquals(expected, testEvent.getAlcohol());
  }

  @Test
  public void calculatePeopleCost_returnsCostForPeopleInvited_Integer() {
    Event testEvent = new Event(1, 1, 1, 1);
    Integer expected = 200;
    assertEquals(expected, testEvent.calculatePeopleCost());
  }

  @Test
  public void calculateEntertainmentCost_returnsCostForEntertainment_Integer() {
    Event testEvent = new Event(1, 1, 1, 1);
    Integer expected = 100;
    assertEquals(expected, testEvent.calculateEntertainmentCost());
  }

  @Test
  public void calculateFoodCost_returnsCostForFood_Integer() {
    Event testEvent = new Event(1, 1, 1, 1);
    Integer expected = 500;
    assertEquals(expected, testEvent.calculateFoodCost());
  }

  @Test
  public void calculateAlcoholCost_returnsCostForAlcohol_Integer() {
    Event testEvent = new Event(1, 1, 1, 1);
    Integer expected = 1000;
    assertEquals(expected, testEvent.calculateAlcoholCost());
  }
}
