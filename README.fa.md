<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:050505,35:171717,70:303030,100:050505&height=190&section=header&text=KotletLand%20Projects&fontSize=54&fontColor=ffffff&fontAlignY=38&desc=ANTI-CHEAT%20AND%20A%20PVP%20CLIENT&descAlignY=62&descSize=13" width="100%" />

<br/>

<img src="https://img.shields.io/badge/JAVA%2021-111111?style=for-the-badge&logo=openjdk&logoColor=white" /> <img src="https://img.shields.io/badge/PAPER-111111?style=for-the-badge&logo=papermc&logoColor=white" /> <img src="https://img.shields.io/badge/FORGE%201.8.9-111111?style=for-the-badge&logo=curseforge&logoColor=white" /> <img src="https://img.shields.io/github/stars/TheROMZ52/kotletland-projects?style=for-the-badge&color=111111&labelColor=050505&logo=github" /> <img src="https://img.shields.io/github/last-commit/TheROMZ52/kotletland-projects?style=for-the-badge&color=111111&labelColor=050505" />

<br/>

## پروژه‌های کتلت‌لند

### جعبه‌ابزار دنیای کتلت‌لند؛ از آنتی‌چیت تا ابزارهای سرور و کم‌کردن لحظه‌های «کی سرور رو ترکوند؟».

<img src="https://skillicons.dev/icons?i=java,gradle,maven,githubactions&theme=dark" />

</div>

---

مجموعه‌ای از ابزارها و پروژه‌های توسعه‌ای مرتبط با شبکهٔ سرورهای Minecraft کتلت‌لند.

---

## 01 / پروژه‌ها

### KotletLandAC

یک افزونهٔ ضدتقلب مبتنی بر شواهد برای Paper 1.21.x که با Java 21 ساخته شده است. این افزونه به‌جای مجازات بازیکن بر اساس یک آستانهٔ منفرد، شواهد را در طول زمان جمع‌آوری و بین بررسی‌های مختلف همبسته می‌کند.

- ثبت شواهد همراه با میزان اطمینان
- بررسی‌های حرکتی و مبارزه
- اتصال اختیاری به سیگنال‌های GrimAC
- ذخیره‌سازی اختیاری شواهد در SQLite یا MySQL
- ماژول اختیاری Velocity برای ارسال هشدار بین سرورها
- مجازات خودکار به‌صورت پیش‌فرض غیرفعال است

**نسخهٔ مستندشدهٔ فعلی:** 1.2.0.

**نکتهٔ مهم:** این افزونه هنوز روی سرور زنده و با بازیکنان واقعی اعتبارسنجی نشده است. هشدارها را سرنخ‌هایی برای بررسی تیم مدیریت بدان، نه مدرک قطعی تخلف. جزئیات در [مستندات کامل KotletLandAC](KotletLandAC/README.md) آمده است.

### KotletClient

مود کلاینت PvP برای کتلت‌لند روی Minecraft 1.8.9 (با Forge). ماژول‌های HUD، کیستروک، تارگت HUD، کراس‌هیر سفارشی، زوم نرم، منوی تنظیمات داخل بازی با تم‌های رنگی و منوی اصلی انیمیشنی کتلت‌لند. فقط ماژول‌های لجیت، بدون تقلب.

جزئیات در [مستندات KotletClient](KotletClient/README.md) آمده است.

---

## 02 / ساختار مخزن

- `KotletLandAC/` — افزونهٔ ضدتقلب Paper و ماژول هشدار Velocity
- `KotletClient/` — مود کلاینت PvP برای Forge 1.8.9

---

## 03 / ساخت

از داخل پوشهٔ افزونه:

```bash
cd KotletLandAC
gradle test build
```

برای نصب روی سرور به Java 21 و Paper 1.21.x نیاز است.

---

## 04 / مستندات

- [English](README.md)
- [فارسی](README.fa.md)
- [مستندات فنی KotletLandAC](KotletLandAC/README.md)
- [KotletLandAC — راهنمای فارسی](KotletLandAC/README.fa.md)

---

<div align="center">

<a href="https://github.com/TheROMZ52?tab=repositories"><img src="https://img.shields.io/badge/MORE%20PROJECTS-111111?style=for-the-badge&logo=github&logoColor=white" /></a>

<br/><br/>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:050505,50:202020,100:050505&height=110&section=footer" width="100%" />

<sub>© TheROMZ52 • ساخته‌شده با کد، کنجکاوی و تعداد مشکوکی تب باز.</sub>

</div>
