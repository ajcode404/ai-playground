package io.github.ajcode404

import ai.koog.agents.core.tools.ToolDescriptor
import ai.koog.prompt.dsl.ModerationResult
import ai.koog.prompt.dsl.Prompt
import ai.koog.prompt.executor.clients.LLMClient
import ai.koog.prompt.executor.clients.LLMEmbeddingProvider
import ai.koog.prompt.executor.llms.SingleLLMPromptExecutor
import ai.koog.prompt.llm.LLMProvider
import ai.koog.prompt.llm.LLModel
import ai.koog.prompt.message.Message
import kotlinx.coroutines.flow.Flow
import kotlinx.serialization.Serializable

@Serializable
data object CustomLLMProvider : LLMProvider("toast", "Toast")

class CustomClient : LLMClient, LLMEmbeddingProvider {
    override suspend fun execute(
        prompt: Prompt,
        model: LLModel,
        tools: List<ToolDescriptor>
    ): List<Message.Response> {
        TODO("Not yet implemented")
    }

    override fun executeStreaming(
        prompt: Prompt,
        model: LLModel
    ): Flow<String> {
        TODO("Not yet implemented")
    }

    override suspend fun moderate(
        prompt: Prompt,
        model: LLModel
    ): ModerationResult {
        TODO("Not yet implemented")
    }

    override suspend fun embed(
        text: String,
        model: LLModel
    ): List<Double> {
        TODO("Not yet implemented")
    }
}

public fun simpleCustomAIExecutor(): SingleLLMPromptExecutor = SingleLLMPromptExecutor(CustomClient())