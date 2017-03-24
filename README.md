# VersionPlayground
Jeder Software-Entwickler kennt die Herausforderung ein Umsystem anbinden zu müssen, dessen Schnittstellen nicht stabil sind. Schwierig wird es vorallem, wenn regelmässig neue Versionen der Schnittstelle herauskommen, die nicht oder nur teilweise kompatibel sind. In diesem Projekt will ich herausfinden, wie das Abnehmersystem damit umgehen kann. 

Ausgangslage:

 * Das Umsystem bietet die gleiche Schnittstellen in unterschiedlichen Versionen an.
 * Jede Version ist über eine eigene URL erreichbar
 * Alle drei Wochen erscheint eine neue Version
 * Jede neue Version kann Breaking Changes beinhalten
 
Ziel:

 * Der Client soll mehrere Versionen der Schnittstelle anbinden.
 * Die verwendete Version soll zur Laufzeit konfigurierbar sein.
 * Der Client muss damit umgehen können, das bestimmte Daten erst mit neueren Versionen kommen.