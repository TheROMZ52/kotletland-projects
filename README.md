<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:050505,35:171717,70:303030,100:050505&height=190&section=header&text=KotletLand%20Projects&fontSize=54&fontColor=ffffff&fontAlignY=38&desc=ANTI-CHEAT%20AND%20A%20PVP%20CLIENT&descAlignY=62&descSize=13" width="100%" />

<br/>

<img src="https://img.shields.io/badge/JAVA%2021-111111?style=for-the-badge&logo=openjdk&logoColor=white" /> <img src="https://img.shields.io/badge/PAPER-111111?style=for-the-badge&logo=papermc&logoColor=white" /> <img src="https://img.shields.io/badge/FORGE%201.8.9-111111?style=for-the-badge&logo=curseforge&logoColor=white" /> <img src="https://img.shields.io/github/stars/TheROMZ52/kotletland-projects?style=for-the-badge&color=111111&labelColor=050505&logo=github" /> <img src="https://img.shields.io/github/last-commit/TheROMZ52/kotletland-projects?style=for-the-badge&color=111111&labelColor=050505" />

<br/>

### A toolbox for the KotletLand universe — anti-cheat, server utilities, and fewer “who broke the server?” moments.

<img src="https://skillicons.dev/icons?i=java,gradle,maven,githubactions&theme=dark" />

</div>

---

A collection of Minecraft server tools and development projects for the KotletLand network.

---

## 01 / PROJECTS

### KotletLandAC

An evidence-driven anti-cheat plugin for Paper 1.21.x, built with Java 21. It correlates signals over time instead of issuing a punishment from a single threshold.

- Confidence-based evidence and cross-check correlation
- Movement and combat checks
- Optional GrimAC signal integration
- Optional SQLite/MySQL evidence storage
- Optional Velocity bridge for cross-server staff alerts
- Automatic punishment disabled by default

**Current documented version:** 1.2.0.

**Important:** the plugin has not yet been validated on a live server with real players. Treat detections as staff-review leads, not proof. See the full [KotletLandAC documentation](KotletLandAC/README.md).

### KotletClient

A PvP client mod for KotletLand on Minecraft 1.8.9 (Forge). HUD modules, keystrokes, target HUD, custom crosshair, smooth zoom, an in-game settings menu with themes, and an animated KotletLand main menu. Only legit modules, no cheats.

See the [KotletClient documentation](KotletClient/README.md).

---

## 02 / REPOSITORY STRUCTURE

- `KotletLandAC/` — Paper anti-cheat plugin and Velocity alert module
- `KotletClient/` — Forge 1.8.9 PvP client mod

---

## 03 / BUILD

From the plugin directory:

```bash
cd KotletLandAC
gradle test build
```

Requirements: Java 21 and Paper 1.21.x for a server installation.

---

## 04 / DOCUMENTATION

- [English](README.md)
- [فارسی](README.fa.md)
- [KotletLandAC technical documentation](KotletLandAC/README.md)
- [KotletLandAC — راهنمای فارسی](KotletLandAC/README.fa.md)
- [KotletClient documentation](KotletClient/README.md)

---

<div align="center">

<a href="https://github.com/TheROMZ52?tab=repositories"><img src="https://img.shields.io/badge/MORE%20PROJECTS-111111?style=for-the-badge&logo=github&logoColor=white" /></a>

<br/><br/>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:050505,50:202020,100:050505&height=110&section=footer" width="100%" />

<sub>© TheROMZ52 • Built with code, curiosity, and a suspicious number of tabs.</sub>

</div>
