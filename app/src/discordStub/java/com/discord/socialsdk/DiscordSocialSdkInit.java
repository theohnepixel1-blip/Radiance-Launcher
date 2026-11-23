package com.discord.socialsdk;

import android.app.Activity;

/**
 * Stand-in used only when app/libs/discord_partner_sdk.aar is not present.
 * Discord rich presence stays off; the rest of the launcher still builds.
 */
public final class DiscordSocialSdkInit {
    private DiscordSocialSdkInit() {}

    public static void setEngineActivity(Activity activity) {}
}
