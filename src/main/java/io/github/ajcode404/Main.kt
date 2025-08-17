package io.github.ajcode404

import ai.koog.agents.core.agent.AIAgent
import ai.koog.prompt.executor.llms.all.simpleOllamaAIExecutor
import ai.koog.prompt.llm.OllamaModels
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        val agent = AIAgent(
            executor = simpleOllamaAIExecutor(),
            systemPrompt = "You are a helpful assistant. Answer user questions concisely.",
            llmModel = OllamaModels.Meta.LLAMA_3_2
        )

        val result = agent.run("Hello! How can you help me?")
        println(result)
    }
}