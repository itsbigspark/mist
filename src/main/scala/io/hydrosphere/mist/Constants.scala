package io.hydrosphere.mist

import java.util.concurrent.TimeUnit
import scala.concurrent.duration.{Duration, FiniteDuration}

object Constants {
  object Actors {
    final val syncJobRunnerName = "SyncJobRunner"
    final val asyncJobRunnerName = "AsyncJobRunner"
    final val clusterManagerName = "ClusterManager"
    final val mqttServiceName = "MQTTService"
    final val kafkaServiceName = "KafkaService"
    final val contextNode = "ContextNode"
    final val cliName = "CLI"
  }
  
  object CLI {
    object Commands {
      final val stopWorker = "kill worker"
      final val stopJob = "kill job"
      final val listWorkers = "list workers"
      final val listRouters = "list routers"
      final val listJobs = "list jobs"
      final val stopAllWorkers = "kill all"
      final val exit = "exit"
      final val startJob = "start job"
    }
    
    final val noWorkersMsg = "no workers"
    final val internalUserInterfaceActorName = "InternalUIActor"
    final val timeoutDuration = FiniteDuration(Duration("10 sec").toSeconds, TimeUnit.SECONDS)
    final val stopAllWorkers = "All contexts are scheduled for shutdown."
  }
}
