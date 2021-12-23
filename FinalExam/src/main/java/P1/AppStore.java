package P1;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
Class AppStore contains information about two different categories of apps - approved apps,
and apps currently under review, for approval and addition to the app store. Approved apps
are stored into a map, where the app represents the key, and the number of downloads,
represented as an Integer is the corresponding value.
*/
public class AppStore {

  private Map<MobileApp, Integer> approvedApps;
  private List<MobileApp> appsUnderReview;

  public AppStore(Map<MobileApp, Integer> approvedApps, List<MobileApp> appsUnderReview) {
    this.approvedApps = approvedApps;
    this.appsUnderReview = appsUnderReview;
  }

  public Map<MobileApp, Integer> getApprovedApps() {
    return approvedApps;
  }

  public List<MobileApp> getAppsUnderReview() {
    return appsUnderReview;
  }

  /**
   * Return a List of MobileApp that have the given  requestedCategory and requestedDate.
   * @param requestedCategory MobileAppCategory, take requestedCategory as a argument
   * @param requestedDate LocalDate, take requestedDate as a argument
   * @return a List of MobileApp that have the given  requestedCategory and requestedDate
   */
  public List<MobileApp> mysteryMethod(MobileAppCategory requestedCategory,
      LocalDate requestedDate) {
    return this.approvedApps.keySet().stream()
        .filter(x -> x.getAppCategory().equals(requestedCategory))
        .filter(y -> y.getDateOfOriginalRelease().isAfter(requestedDate))
        .collect(Collectors.toList());
  }

  /**
   * Return a list of all mobile apps currently under review for inclusion
   * into the app store, that are requesting at most the number of permissions defined by the input
   * argument and are not requesting any of the permissions provided as input argument
   * String permission1, permission2.
   * @param maxNumPermissions Integer, maxNumPermissions
   * @param permission1 String , permission1
   * @param permission2 String, permission2
   * @return a list of all mobile apps currently under review for inclusion into the app store,
   * that are requesting at most the number of permissions defined by the input argument
   */
  public List<MobileApp> filterByRequestedPermissions(Integer maxNumPermissions,
      String permission1, String permission2) {

    return this.appsUnderReview.stream().filter(s -> s.getRequestedPermissions().size()
        <= maxNumPermissions &&
        !s.getRequestedPermissions().contains(permission1) &&
        !s.getRequestedPermissions().contains(permission2)).collect(Collectors.toList());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof AppStore))
      return false;
    AppStore appStore = (AppStore) o;
    return Objects.equals(getApprovedApps(), appStore.getApprovedApps()) &&
        Objects.equals(getAppsUnderReview(), appStore.getAppsUnderReview());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getApprovedApps(), getAppsUnderReview());
  }


  @Override
  public String toString() {
    return "AppStore{" +
        "approvedApps=" + approvedApps +
        ", appsUnderReview=" + appsUnderReview +
        '}';
  }
}