package cguglielmo.server.security;

import java.security.AllPermission;
import java.security.Permissions;

import cguglielmo.shared.security.AccessControlService;
import org.eclipse.scout.rt.platform.Replace;
import org.eclipse.scout.rt.shared.security.RemoteServiceAccessPermission;

@Replace
public class ServerAccessControlService extends AccessControlService {

  @Override
  protected Permissions execLoadPermissions(String userId) {
    Permissions permissions = new Permissions();
    permissions.add(new RemoteServiceAccessPermission("*.shared.*", "*"));

    //TODO [Scout Robot]: Fill access control service
    permissions.add(new AllPermission());
    return permissions;
  }
}
