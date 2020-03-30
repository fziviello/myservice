# myservice
Esempio di un servizio

**Comandi ADB per testarlo:**

`adb shell `

- `am startservice -n com.ziviello.myservice/.MyService -a HELLO`

- `am startservice -n com.ziviello.myservice/.MyService -a CIAO`

- `am startservice -n com.ziviello.myservice/.MyService -a OTHER`

- `am stopservice com.ziviello.myservice/.MyService`