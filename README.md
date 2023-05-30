# BIT-MiniCC-LTS

The IDEA and LTS version of BIT-MiniCC.

## How to run in VS 2019

1. Copy the code from generated x86 `.asm` file into `VS_Project` directory.

2. Replace the lines:

```asm
includelib msvcrt.lib
includelib user32.lib
includelib kernel32.lib
```

Into:

```asm
includelib ucrt.lib
includelib legacy_stdio_definitions.lib
```

3. Open `ASM-Project.sln` in `VS_Project` directory and switch run configuation into `x86`, and you are done :)