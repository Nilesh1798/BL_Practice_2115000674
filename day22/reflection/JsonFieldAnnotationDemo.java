import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class JsonUser {
    @JsonField(name = "user_name")
    private String username;

    public JsonUser(String username) {
        this.username = username;
    }
}