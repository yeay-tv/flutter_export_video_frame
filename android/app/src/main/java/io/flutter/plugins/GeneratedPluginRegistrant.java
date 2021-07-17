package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.mengtnt.export_video_frame.ExportVideoFramePlugin;
import asia.ivity.mediainfo.MediaInfoPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    ExportVideoFramePlugin.registerWith(registry.registrarFor("com.mengtnt.export_video_frame.ExportVideoFramePlugin"));
    MediaInfoPlugin.registerWith(registry.registrarFor("asia.ivity.mediainfo.MediaInfoPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
