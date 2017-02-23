import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mfournial on 23/02/2017.
 *
 * Get input data
 */
public class Main {
  public static void main(String[] args) {
    BufferedReader bf;
    try {
      bf = new BufferedReader(new FileReader(args[0]));
    } catch (FileNotFoundException f) {
      System.err.println("Could not open the file");
      return;
    }

    Scanner s = new Scanner(bf);

    int videosNumber = s.nextInt();
    int endpointsNumber = s.nextInt();
    int requestsNumber = s.nextInt();
    int cachesNumber = s.nextInt();
    int cachesSize = s.nextInt();

    List<Video> videos = new ArrayList<>(videosNumber);

    for(int i = 0; i < videosNumber; i++) {
      videos.add(new Video(s.nextInt()));
    }

    List<Endpoint> endpoints = new ArrayList<>(endpointsNumber);

    for(int i = 0; i < endpointsNumber; i++) {
      int numberOfCaches;
      Endpoint currentEndpoint;
      endpoints.add(currentEndpoint = new Endpoint(s.nextInt(), numberOfCaches = s.nextInt()));
      for(int j = 0; j < numberOfCaches; j++) {
        currentEndpoint.addCache(s.nextInt(), s.nextInt());
      }
    }

    while(s.hasNext()) {
      videos.get(s.nextInt()).addRequest(new Request(s.nextInt(), s.nextInt()));
    }
    int x = 0;
  }
}
