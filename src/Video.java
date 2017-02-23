import java.util.ArrayList;
import java.util.List;

/**
 * Created by mfournial on 23/02/2017.
 */
public class Video {
  private final int size;
  private final List<Request> requests;

  public Video(int size) {
    this.size = size;
    // Need to optimise the size
    requests = new ArrayList<>();
  }

  public void addRequest(Request request) {
    requests.add(request);
  }

  public List<Request> getRequests() {
    return requests;
  }

  public int getSize() {
    return size;
  }
}
