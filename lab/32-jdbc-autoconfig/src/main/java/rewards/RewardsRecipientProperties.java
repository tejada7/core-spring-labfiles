package rewards;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

// TODO-06 : Capture properties into a class using @ConfigurationProperties
// - Note that application.properties file already contains the following properties
//
//    rewards.recipient.name=John Doe
//    rewards.recipient.age=10
//    rewards.recipient.gender=Male
//    rewards.recipient.hobby=Tennis
//
// - Annotate this class with @ConfigurationProperties
//   with prefix attribute set to a proper value
// - Create fields (along with needed getters/setters) that reflect the
//   properties above in the RewardsRecipientProperties class
// - Use one of the following 3 schemes to enable @ConfigurationProperties
//   (1) Add @EnableConfigurationProperties(RewardsRecipientProperties.class)
//       to the RewardsApplication class
//   (2) Add @ConfigurationPropertiesScan to RewardsApplication class or
//   (3) Annotate this class with @Component
// - Implement a new command line runner that displays the name of the rewards
//   recipient when the application gets started
@ConfigurationProperties(prefix = "rewards.recipient")
@ConstructorBinding
public final class RewardsRecipientProperties {

    private final String name;
    private final int age;
    private final String gender;
    private final String hobby;

    public RewardsRecipientProperties(final String name, final int age, final String gender, final String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }
}
