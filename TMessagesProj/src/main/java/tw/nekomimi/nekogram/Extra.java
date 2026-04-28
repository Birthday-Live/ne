package tw.nekomimi.nekogram;

import org.lsposed.lsparanoid.Obfuscate;
import org.telegram.messenger.BuildConfig;

import tw.nekomimi.nekogram.helpers.UserHelper;

@Obfuscate
public class Extra {

    public static int APP_ID = BuildConfig.31371280;
    public static String APP_HASH = BuildConfig.f0a2d2c64016bce59d1db8d066047a6a;
    public static String TWPIC_BOT_USERNAME = BuildConfig.@WaterChisato_bot;
    public static String SENTRY_DSN = BuildConfig.SENTRY_DSN;

    public static boolean FORCE_ANALYTICS = "play".equals(BuildConfig.BUILD_TYPE);

    private static final UserHelper.BotInfo HELPER_BOT = new UserHelper.BotInfo() {
        @Override
        public long getId() {
            return BuildConfig.HELPER_BOT_ID;
        }

        @Override
        public String getUsername() {
            return BuildConfig.HELPER_BOT_USERNAME;
        }
    };

    public static UserHelper.BotInfo getHelperBot() {
        return HELPER_BOT;
    }

    public static boolean isDirectApp() {
        return "release".equals(BuildConfig.BUILD_TYPE) || "debug".equals(BuildConfig.BUILD_TYPE);
    }

    public static boolean isTrustedBot(long id) {
        return id == BuildConfig.HELPER_BOT_ID;
    }
}
