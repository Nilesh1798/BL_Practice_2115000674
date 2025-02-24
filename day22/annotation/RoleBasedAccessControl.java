import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AccessControl {
    private static final String USER_ROLE = "USER"; // Change to "ADMIN" for access

    @RoleAllowed("ADMIN")
    public void adminMethod() {
        if (!USER_ROLE.equals("ADMIN")) {
            System.out.println("Access Denied!");
            return;
        }
        System.out.println("Admin method executed");
    }
}