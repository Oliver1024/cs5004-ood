package P1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class AppStoreTest {
  private String firstName;
  private String middleName;
  private String lastName;

  private String firstName2;
  private String middleName2;
  private String lastName2;

  private  Name name;
  private  Name name2;

  private MobileApp mobileApp;
  private MobileApp mobileApp2;
  private MobileApp mobileApp3;
  private MobileApp mobileApp4;


  private Map<MobileApp, Integer> approvedApps;
  private List<MobileApp> appsUnderReview;

  private Map<MobileApp, Integer> approvedApps2;
  private List<MobileApp> appsUnderReview2;

  private String appName;
  private MobileAppCategory appCategory;
  private Float currentVersion;
  private Float currentSize;
  private List<Name> developers;
  private List<String> requestedPermissions;
  private LocalDate dateOfOriginalRelease;
  private LocalDate dateOfLatestUpdate;

  private AppStore appStore;

  @Before
  public void setUp() throws Exception {
    appName = "a";
    firstName = "a1";
    middleName = "b1";
    lastName = "c1";
    firstName2 = "a2";
    middleName2 = "b2";
    lastName2 = "c2";

    name = new Name(firstName,middleName,lastName);
    name2 = new Name(firstName2,middleName2,lastName2);
    developers = new ArrayList<>();
    developers.add(name);
    developers.add(name2);

    requestedPermissions = new ArrayList<>();
    requestedPermissions.add("c");
    requestedPermissions.add("f");
    requestedPermissions.add("g");



    dateOfOriginalRelease = LocalDate.of(1,1,1);
    dateOfLatestUpdate = LocalDate.of(2,2,2);

    approvedApps = new HashMap<>();
    appsUnderReview = new ArrayList<>();


    mobileApp = new MobileApp(appName,MobileAppCategory.GAME_APP,1f,1f,
        developers,requestedPermissions,dateOfOriginalRelease,dateOfLatestUpdate);

    requestedPermissions = new ArrayList<>();
    requestedPermissions.add("b");
    requestedPermissions.add("c");
    mobileApp2 = new MobileApp(appName,MobileAppCategory.EDUCATIONAL_APP,2f,2f,
        developers,requestedPermissions,dateOfOriginalRelease,dateOfLatestUpdate);

    requestedPermissions = new ArrayList<>();
    requestedPermissions.add("c");
    requestedPermissions.add("a");
    mobileApp3 = new MobileApp(appName,MobileAppCategory.EDUCATIONAL_APP,2f,2f,
        developers,requestedPermissions,dateOfOriginalRelease,dateOfLatestUpdate);

    requestedPermissions = new ArrayList<>();
    requestedPermissions.add("c");
    requestedPermissions.add("d");
    mobileApp4 = new MobileApp(appName,MobileAppCategory.EDUCATIONAL_APP,2f,2f,
        developers,requestedPermissions,dateOfOriginalRelease,dateOfLatestUpdate);

    approvedApps.put(mobileApp,1);
    approvedApps.put(mobileApp,1);
    approvedApps.put(mobileApp2,1);

    approvedApps.put(mobileApp2,1);
    approvedApps.put(mobileApp3,1);
    approvedApps.put(mobileApp4,1);

    appsUnderReview.add(mobileApp);
    appsUnderReview.add(mobileApp2);
    appsUnderReview.add(mobileApp3);
    appsUnderReview.add(mobileApp4);


    appStore = new AppStore(approvedApps,appsUnderReview);

  }

  @Test
  public void mysteryMethod() {
    appStore.mysteryMethod(MobileAppCategory.EDUCATIONAL_APP,
        LocalDate.of(3,3,3));
  }

  @Test
  public void filterByRequestedPermissions() {
    appStore.filterByRequestedPermissions(2,"a","b");

  }
}