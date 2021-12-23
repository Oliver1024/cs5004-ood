package P2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jdk.vm.ci.meta.Local;

public class MobileAppIterator implements Iterator<MobileApp> {
  private static final Integer YEAR_VALUE = 2017;

  @Override
  public boolean hasNext() {
    return this.checkALlValidApps().size() > 0;
  }

  @Override
  public MobileApp next() {
    return this.checkALlValidApps().remove(0);
  }


  /**
   * Helper function that is used to get List of MobileApp
   * @return get List of MobileApp
   */
  private List<MobileApp> checkALlValidApps(){
  List<MobileApp> mobileApps = new ArrayList<>();
  LocalDate releaseDate = LocalDate.of(YEAR_VALUE,1,1);
  String permission1 = "PHOTOS";
  String permission2 = "MESSAGES";
  String permission3 = "LOCATION";

  for(MobileApp mobileApp : mobileApps){
    if(mobileApp.getDateOfOriginalRelease().isAfter(releaseDate))
      if (mobileApp.getAppCategory().equals(MobileAppCategory.EDUCATIONAL_APP) ||
          mobileApp.getAppCategory().equals(MobileAppCategory.PRODUCTIVITY_APP))
        if (!mobileApp.getRequestedPermissions().contains(permission1) &&
        !mobileApp.getRequestedPermissions().contains(permission2) &&
        !mobileApp.getRequestedPermissions().contains(permission3)){
          mobileApps.add(mobileApp);
        }
  }
  return mobileApps;
  }


}
