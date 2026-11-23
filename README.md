<div align="center">

![Radiance Launcher]()

# Radiance Launcher
**A launcher for Minecraft Bedrock on Android**

</div>

---

## Description

Radiance is a lightweight, open-source Android launcher for Minecraft: Bedrock Edition, based on LeviLauncher. It lets you import your official Minecraft APK and run it without a normal system install, manage multiple versions, and load external native modules.

### Key Features

- **APK Import & Installation-Free Launching** – Import your official Minecraft APK and run it directly without system installation
- **SO Module Loading** – Load external native SO modules to extend or enhance Minecraft features and performance
- **Multi-Version Management & Version Isolation** – Manage multiple Minecraft versions independently, with separated configurations and data
- **Multiple Xbox Account Management** – Manage multiple Xbox accounts inside the launcher and switch between them seamlessly
- **Resource Pack & World Management** – Import, export, and back up your resource packs and worlds with the built-in manager

---

## System Requirements

- **Operating System:** Android 9.0 (API 28) or higher
- **Device Architecture:** ARM64 (v8a)
- **RAM:** Minimum 1 GB available RAM (2 GB or more recommended)
- **Storage:** At least 2 GB of available storage for Minecraft and game data

You need a licensed copy of Minecraft Bedrock. Radiance does not include the game.

---

## Installation

1. Visit the [Releases page](https://github.com/theohnepixel1-blip/Radiance-Launcher/releases) after a tagged build, or download the APK artifact from a successful [Actions run](https://github.com/theohnepixel1-blip/Radiance-Launcher/actions).
2. Allow installation from unknown sources.
3. Install the APK and open Radiance.

---

## Development Setup

- Git
- Android Studio
- JDK 21
- Android SDK, API 28 or higher, plus NDK r28c

```bash
git clone --recurse-submodules https://github.com/theohnepixel1-blip/Radiance-Launcher.git
```

Open the project in Android Studio and let Gradle sync. Discord rich presence needs the private partner SDK at `app/libs/discord_partner_sdk.aar`. Without that file the launcher still builds and rich presence stays off. `google-services.json` is optional; CI writes a placeholder so Firebase can compile.

Run it on an ARM64 device or emulator (API 28+).

---

## Credits

Radiance is built on [LeviLauncher](https://github.com/LiteLDev/LeviLaunchroid) by the LeviMC team and its contributors, under the Apache License 2.0. Do not claim this project as an original LeviMC release.
