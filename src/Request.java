/**
 * Created by mfournial on 23/02/2017.
 */
public class Request {
  private int endpoint;
  private int number;

  public Request(int endpoint, int requestNumber) {
    this.endpoint = endpoint;
    this.number = requestNumber;
  }

  public int getEndpoint() {
    return endpoint;
  }

  public int getNumber() {
    return number;
  }
}
