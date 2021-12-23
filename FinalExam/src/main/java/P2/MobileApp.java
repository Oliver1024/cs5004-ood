package P2;

import P1.Name;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
Class MobileApp contains information about a mobile app - app’s name, app’s category,
current version, current size, developers, requested permissions, date of original release,
date of the latest update, map of all of the supported operating systems, and the
number of downloads for that operating system.
*/
public class MobileApp implements Comparable<MobileApp> {

  private String appName;
  private MobileAppCategory appCategory;
  private Float currentVersion;
  private Float currentSize;
  private List<P1.Name> developers;
  private List<String> requestedPermissions;
  private LocalDate dateOfOriginalRelease;
  private LocalDate dateOfLatestUpdate;
  private Map<String, Integer> supportedOS;
  private static final Integer NEGATIVE_VALUE = -1;

  public MobileApp(String appName, MobileAppCategory appCategory, Float currentVersion,
      Float currentSize,
      List<Name> developers, List<String> requestedPermissions, LocalDate dateOfOriginalRelease,
      LocalDate dateOfLatestUpdate, Map<String, Integer> supportedOS) {
    this.appName = appName;
    this.appCategory = appCategory;
    this.currentVersion = currentVersion;
    this.currentSize = currentSize;
    this.developers = developers;
    this.requestedPermissions = requestedPermissions;
    this.dateOfOriginalRelease = dateOfOriginalRelease;
    this.dateOfLatestUpdate = dateOfLatestUpdate;
    this.supportedOS = supportedOS;
  }

  public String getAppName() {
    return appName;
  }

  public MobileAppCategory getAppCategory() {
    return appCategory;
  }

  public Float getCurrentVersion() {
    return currentVersion;
  }

  public Float getCurrentSize() {
    return currentSize;
  }

  public List<Name> getDevelopers() {
    return developers;
  }

  public List<String> getRequestedPermissions() {
    return requestedPermissions;

  }

  public LocalDate getDateOfOriginalRelease() {
    return dateOfOriginalRelease;
  }

  public LocalDate getDateOfLatestUpdate() {
    return dateOfLatestUpdate;
  }

  public Map<String, Integer> getSupportedOS() {
    return supportedOS;
  }


  @Override
  public int compareTo(MobileApp other) {
    if (this.checkAllTimes() < other.checkAllTimes()) return NEGATIVE_VALUE;
    else if (this.checkAllTimes() > other.checkAllTimes()) return 1;
    return 0;
  }

  private int checkAllTimes(){
   int output = 0;
    for(Map.Entry<String, Integer> entry : this.getSupportedOS().entrySet()){
      output += entry.getValue();
   }
    return output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MobileApp)) return false;
    MobileApp mobileApp = (MobileApp) o;
    return Objects.equals(getAppName(), mobileApp.getAppName()) &&
        getAppCategory() == mobileApp.getAppCategory() &&
        Objects.equals(getCurrentVersion(), mobileApp.getCurrentVersion()) &&
        Objects.equals(getCurrentSize(), mobileApp.getCurrentSize()) &&
        Objects.equals(getDevelopers(), mobileApp.getDevelopers()) &&
        Objects.equals(getRequestedPermissions(), mobileApp.getRequestedPermissions()) &&
        Objects.equals(getDateOfOriginalRelease(), mobileApp.getDateOfOriginalRelease()) &&
        Objects.equals(getDateOfLatestUpdate(), mobileApp.getDateOfLatestUpdate()) &&
        Objects.equals(getSupportedOS(), mobileApp.getSupportedOS());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAppName(), getAppCategory(), getCurrentVersion(),
        getCurrentSize(), getDevelopers(), getRequestedPermissions(), getDateOfOriginalRelease(),
        getDateOfLatestUpdate(), getSupportedOS());
  }

  @Override
  public String toString() {
    return "MobileApp{" +
        "appName='" + appName + '\'' +
        ", appCategory=" + appCategory +
        ", currentVersion=" + currentVersion +
        ", currentSize=" + currentSize +
        ", developers=" + developers +
        ", requestedPermissions=" + requestedPermissions +
        ", dateOfOriginalRelease=" + dateOfOriginalRelease +
        ", dateOfLatestUpdate=" + dateOfLatestUpdate +
        ", supportedOS=" + supportedOS +
        '}';
  }
}


