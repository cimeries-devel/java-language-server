package org.javacs.debug;

public interface DebugServer {
    Capabilities initialize(InitializeRequestArguments req);

    SetBreakpointsResponseBody setBreakpoints(SetBreakpointsArguments req);

    SetFunctionBreakpointsResponseBody setFunctionBreakpoints(SetFunctionBreakpointsArguments req);

    void setExceptionBreakpoints(SetExceptionBreakpointsArguments req);

    void configurationDone();

    void launch(LaunchRequestArguments req);

    void attach(AttachRequestArguments req);

    void disconnect(DisconnectArguments req);

    void terminate(TerminateArguments req);

    void continue_(ContinueArguments req);

    void next(NextArguments req);

    void stepIn(StepInArguments req);

    void stepOut(StepOutArguments req);

    ThreadsResponseBody threads();

    VariablesResponseBody variables(VariablesArguments req);

    EvaluateResponseBody evaluate(EvaluateArguments req);
}
