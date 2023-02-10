package instrument;

public class LLL {

    public void m(ToStringHelper helper) {
        helper.add("author", author.stream().map(a -> a.commit).collect(Collectors.joining(", ")));
    }
}
