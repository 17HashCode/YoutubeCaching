import java.util.HashMap;
import java.util.Map;

/**
 * Created by mfournial on 23/02/2017.
 */
public class Endpoint {
  private final int dataCenterLatency;
  private final Map<Integer, Integer> cacheToLatency;

  public Endpoint(int dataCenterLatency, int numberOfCaches) {
    this.dataCenterLatency = dataCenterLatency;
    this.cacheToLatency = new HashMap<>(numberOfCaches); // LinkedHa
  }

  public int getDataCenterLatency() {
    return dataCenterLatency;
  }

  public Map<Integer, Integer> getCachesLatency() {
    return cacheToLatency;
  }

  public void addCache(int cacheNumber, int latency) {
    cacheToLatency.put(cacheNumber, latency);
  }
}
