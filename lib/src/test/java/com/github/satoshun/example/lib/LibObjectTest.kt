package com.github.satoshun.example.lib

import android.widget.LinearLayout
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

//@RunWith(AndroidJUnit4::class)
class LibObjectTest {
  enum class Config(
    val deviceConfig: DeviceConfig,
  ) {
    NEXUS_4(deviceConfig = DeviceConfig.NEXUS_4),
    NEXUS_5(deviceConfig = DeviceConfig.NEXUS_5),
    NEXUS_5_LAND(deviceConfig = DeviceConfig.NEXUS_5_LAND),
  }

  @get:Rule
  var paparazzi = Paparazzi(deviceConfig = Config.NEXUS_5.deviceConfig)

  @Test
  fun first() {
    val launch = paparazzi.inflate<LinearLayout>(R.layout.lib_item)
//    paparazzi.snapshot(launch, theme = "android:Theme.Material.Light")
    paparazzi.snapshot(view = launch, name = "first")
  }
}
