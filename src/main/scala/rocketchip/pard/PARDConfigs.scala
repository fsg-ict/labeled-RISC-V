// See LICENSE for license details.

package freechips.rocketchip.system

import freechips.rocketchip.coreplex._
import freechips.rocketchip.config._
import freechips.rocketchip.system._

class PARDSimConfig extends Config(new WithNBigCores(2)
  ++ new WithoutFPU
  ++ new WithAynchronousRocketTiles(8, 3)
  ++ new WithExtMemSize(0x800000L)
  ++ new BaseConfig)

class PARDFPGAConfigvc709 extends Config(new FPGAConfig
  //++ new WithJtagDTM
  ++ new WithoutFPU
  ++ new WithExtMemSize(0x40000000L) // 1GB
  ++ new WithNBigCores(2)
  ++ new WithAynchronousRocketTiles(8, 3)
  ++ new WithRTCPeriod(50) // gives 10 MHz RTC assuming 50 MHz uncore clock
  ++ new BaseConfig)

class PARDFPGAConfigzedboard extends Config(new FPGAConfig
  //++ new WithJtagDTM
  ++ new WithoutFPU
  ++ new WithExtMemSize(0x4000000L) // 64MB
  ++ new WithNBigCores(2)
  ++ new WithAynchronousRocketTiles(8, 3)
  ++ new WithRTCPeriod(50) // gives 10 MHz RTC assuming 50 MHz uncore clock
  ++ new BaseConfig)

class PARDFPGAConfigzcu102 extends Config(new FPGAConfig
  //++ new WithJtagDTM
  ++ new WithoutFPU
  ++ new WithExtMemSize(0x10000000L) // 256MB
  ++ new WithNBigCores(2)
  ++ new WithAynchronousRocketTiles(8, 3)
  ++ new WithRTCPeriod(100)
  ++ new BaseConfig)